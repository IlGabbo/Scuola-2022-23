function calc(hour, timezone) {
    return (hour + (hour + timezone) + (24 - hour)) % 24;
}

let input = parseInt(prompt("Enter a hour"));

if (input < 24 && input >= 0) {
    alert(calc(input, +6));
    alert(calc(input, +1));
    alert(calc(input, -6));
} else
    alert("Invalid Hour");