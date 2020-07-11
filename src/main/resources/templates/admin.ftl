<head>
    <script src="https://www.gstatic.com/charts/loader.js"></script>
    <script>
        google.charts.load('current', {'packages': ['corechart']});
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {
            var data = new google.visualization.DataTable();
            data.addColumn('string', 'Preguntas');
            data.addColumn('number', 'Votos');
            data.addRows([
                ['¿Las charlas donde usted participó cumplieron con sus expectativas?', ${first}],
                ['¿Los expositores mostraron tener dominio del tema?', ${second}],
                ['¿Las instalaciones del evento fueron confortables para usted?', ${third}]
            ]);
            var options = {'title': 'Resultados', 'width': 1280, 'height': 720};
            var chart = new google.visualization.ColumnChart(document.getElementById('chart'));
            chart.draw(data, options);
        }
    </script>
</head>
<body>
<div id="chart"/>
</body>