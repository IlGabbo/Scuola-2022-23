function DaysInMonth(month, year) {
    return new Date(year, month, 0).getDate();
}

function Vote(vote) {
    if (vote < 6.0)
        return "insufficient";
    else if (vote <= 6.9)
        return "sufficient";
    else if (vote >= 7.9)
        return "good";
    else
        return "adequate";
}

function GetMilliseconds(hours, minutes) {
    return (hours * 60 * 60 * 1000) + (minutes * 60 * 1000)
}

function FahrenheitToDegrees(temperature) {
    return (temperature - 32.0) * 5.0 / 9.0;
}

function TimezoneHour(timezone, inputHour, inputMinute) {
    timezone.toLowerCase();
    let dt = luxon.DateTime.fromObject({hour: inputHour, minute: inputMinute}, {zone: luxon.DateTime.now().zoneName});
    switch (timezone) {
        case "new york":
            return dt.setZone("America/New_York");
        case "tokyo":
            return dt.setZone("Asia/Tokyo");
        case "moscow":
            return dt.setZone("Europe/Moscow");
    }
    return -1;
}

/*
let input, input2, input3;
input = parseInt(prompt("Enter a month"));
input2 = parseInt(prompt("Enter a year"));
alert(DaysInMonth(input, input2) + " Days");

input = parseFloat(prompt("Enter a vote"));
alert(Vote(input));

input = parseInt(prompt("Enter the hour"));
input2 = parseInt(prompt("Enter the minute"));
alert(GetMilliseconds(input, input2));

input = parseFloat(prompt("Enter the temp"));
alert(FahrenheitToDegrees(input));

input = prompt("Enter a timezone - New York/Tokyo/Moscow");
input2 = parseInt(prompt("Enter a hour"));
input3 = parseInt(prompt("Enter a minute"));
alert("The time in " + input + " is = " + TimezoneHour(input, input2, input3).hour + ":" + input3);
*/