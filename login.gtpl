<html>
    <head>
    <title>MD5 Compiler</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    </head>
    <body>
        <form class="form-horizontal" action="/" method="post" style="width: 60%; margin: auto; padding: 3%;">
            <fieldset>

            <!-- Form Name -->
            <legend>Login anonymizer</legend>

            <!-- Text input-->
            <div class="form-group">
            <label class="col-md-4 control-label" for="textinput">Username</label>  
            <div class="col-md-4">
            <input id="textinput" name="username" type="text" placeholder="user@syzygy.pl" class="form-control input-md">
            <span class="help-block">Username to be anonyimzed</span>  
            </div>
            </div>

            <!-- Button -->
            <div class="form-group">
            <div class="col-md-4">
                <button id="singlebutton" name="singlebutton" class="btn btn-primary">Convert login</button>
            </div>
            </div>
            </fieldset>
            </form>
    </body>
</html>