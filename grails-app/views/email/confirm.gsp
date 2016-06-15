<!doctype html>
<html>
<head>
    <title>Confirmation</title>
</head>

<body>

<h2><g:render template="/email/welcome" model="[ username: username ]"/></h2>

<p>
    Thank you for your registration.
</p>

<p>
    To use the application can you directly go to the
    <g:link absolute="true" controller="index">home page</g:link>.
</p>

</body>
</html>
