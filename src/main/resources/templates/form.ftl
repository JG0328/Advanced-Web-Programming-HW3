<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/css/bootstrap.min.css">
        <link rel="stylesheet" href="/css/styles.css">
        <title>Encuesta Barcamp</title>
    </head>


    <body>
        <form method="get" action="/form" class="survey-container">
            <h3>Encuesta Barcamp</h3>
            <br/>
            <div>
                <h5>¿Las charlas donde usted participó cumplieron con sus expectativas?</h5>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-1" id="question-1-option-1" value="1">
                    <label class="form-check-label" for="question-1-option-1">1</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-1" id="question-1-option-2" value="2">
                    <label class="form-check-label" for="question-1-option-2">2</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-1" id="question-1-option-3" value="3">
                    <label class="form-check-label" for="question-1-option-3">3</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-1" id="question-1-option-4" value="4">
                    <label class="form-check-label" for="question-1-option-4">4</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-1" id="question-1-option-5" value="5">
                    <label class="form-check-label" for="question-1-option-5">5</label>
                </div>
            </div>
            <br/>
            <div>
                <h5>¿Los expositores mostraron tener dominio del tema?</h5>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-2" id="question-2-option-1" value="1">
                    <label class="form-check-label" for="question-2-option-1">1</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-2" id="question-2-option-2" value="2">
                    <label class="form-check-label" for="question-2-option-2">2</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-2" id="question-2-option-3" value="3">
                    <label class="form-check-label" for="question-2-option-3">3</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-2" id="question-2-option-4" value="4">
                    <label class="form-check-label" for="question-2-option-4">4</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-2" id="question-2-option-5" value="5">
                    <label class="form-check-label" for="question-2-option-5">5</label>
                </div>
            </div>
            <br/>
            <div>
                <h5>¿Las instalaciones del evento fueron confortables para usted?.</h5>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-3" id="question-3-option-1" value="1">
                    <label class="form-check-label" for="question-3-option-1">1</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-3" id="question-3-option-2" value="2">
                    <label class="form-check-label" for="question-3-option-2">2</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-3" id="question-3-option-3" value="3">
                    <label class="form-check-label" for="question-3-option-3">3</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-3" id="question-3-option-4" value="4">
                    <label class="form-check-label" for="question-3-option-4">4</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="question-3" id="question-3-option-5" value="5">
                    <label class="form-check-label" for="question-3-option-5">5</label>
                </div>
            </div>
            <br/>
            <div>
                <h5>¿Tiene algún comentario para los organizadores?</h5>
                <div class="form-group">
                    <textarea class="form-control" name="comment" id="exampleFormControlTextarea1" rows="3"></textarea>
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    </body>
</html>

<script src="/js/bootstrap.min.js"></script>
