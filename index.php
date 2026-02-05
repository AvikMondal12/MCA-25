<?php
session_start();

/* Initialize session storage */
if (!isset($_SESSION['students'])) {
    $_SESSION['students'] = [];
}

/* Save multiple students */
if (isset($_POST['save'])) {
    $count = count($_POST['name']);

    for ($i = 0; $i < $count; $i++) {
        if (!empty($_POST['name'][$i])) {
            $_SESSION['students'][] = [
                'name'    => trim($_POST['name'][$i]),
                'email'   => trim($_POST['email'][$i]),
                'course'  => trim($_POST['course'][$i]),
                'subject' => trim($_POST['subject'][$i])
            ];
        }
    }
}

/* Delete student */
if (isset($_GET['delete'])) {
    $index = $_GET['delete'];
    if (isset($_SESSION['students'][$index])) {
        unset($_SESSION['students'][$index]);
        $_SESSION['students'] = array_values($_SESSION['students']);
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
    <style>
        body {
            font-family: Arial;
            background: #f4f4f4;
        }
        .container {
            width: 600px;
            margin: 30px auto;
            background: white;
            padding: 20px;
            border-radius: 5px;
        }
        h2, h3 {
            text-align: center;
        }
        input {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
        }
        button {
            width: 100%;
            padding: 10px;
            background: #007bff;
            color: white;
            border: none;
            cursor: pointer;
            margin-top: 10px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 15px;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 8px;
            text-align: center;
        }
        .delete {
            background: red;
            color: white;
            padding: 4px 7px;
            text-decoration: none;
            border-radius: 3px;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Student Registration (Multiple)</h2>

    <form method="post">
        <!-- Student 1 -->
        <input type="text" name="name[]" placeholder="Student Name" required>
        <input type="email" name="email[]" placeholder="Email" required>
        <input type="text" name="course[]" placeholder="Course" required>
        <input type="text" name="subject[]" placeholder="Subject" required>


        <button type="submit" name="save">Save Students</button>
    </form>

    <h3>Stored Students</h3>

    <?php if (!empty($_SESSION['students'])): ?>
        <table>
            <tr>
                <th>#</th>
                <th>Name</th>
                <th>Email</th>
                <th>Course</th>
                <th>Subject</th>
                <th>Action</th>
            </tr>
            <?php foreach ($_SESSION['students'] as $i => $s): ?>
                <tr>
                    <td><?= $i + 1 ?></td>
                    <td><?= htmlspecialchars($s['name']) ?></td>
                    <td><?= htmlspecialchars($s['email']) ?></td>
                    <td><?= htmlspecialchars($s['course']) ?></td>
                    <td><?= htmlspecialchars($s['subject']) ?></td>
                    <td>
                        <a class="delete" href="?delete=<?= $i ?>" onclick="return confirm('Delete student?')">Delete</a>
                    </td>
                </tr>
            <?php endforeach; ?>
        </table>
    <?php else: ?>
        <p style="text-align:center;">No students registered</p>
    <?php endif; ?>
</div>

</body>
</html>
