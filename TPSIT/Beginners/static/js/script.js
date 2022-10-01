function DaysInMonth(month, year) {
    return new Date(year, month, 0).getDate();
}

function Vote(vote) {
    if (vote < 6.0)
        return "insufficient"
    else if (vote > 8.0)
        return "good"
    else
        return "ok"
}

function GetMilliseconds(hours, minutes) {
    return (hours * 60 * 60 * 1000) + (minutes * 60 * 1000)
}

function FahrenheitToDegrees(temperature) {
    return (temperature -32.0) * 5.0 / 9.0;
}

function TimezoneHour(timezone, hour, minutes) {
    if (timezone === "newyork") {
        return hour -7;
    }
    else if (timezone === "tokyo") {
        return hour + 7;
    }
    else if (timezone === "moscow") {
        return hour + 1;
    }
}

let input, input2;
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

