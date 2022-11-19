document.getElementById("ex1Submit").addEventListener("click", function (e) {
    e.preventDefault()
    let month = document.getElementById("ex1Month").value;
    let year = document.getElementById("ex1Year").value;
    document.getElementById("ex1Result").innerHTML = DaysInMonth(month, year).toString();
})

document.getElementById("ex2Submit").addEventListener("click", function (e) {
    e.preventDefault()
    let vote = document.getElementById("ex2Vote").value;
    document.getElementById("ex2Result").innerHTML = Vote(vote);
})

document.getElementById("ex3Submit").addEventListener("click", function (e) {
    e.preventDefault()
    let hours = document.getElementById("ex3Hours").value;
    let minutes = document.getElementById("ex3Minutes").value;
    document.getElementById("ex3Result").innerHTML = GetMilliseconds(hours, minutes).toString();
})

document.getElementById("ex4Submit").addEventListener("click", function (e) {
    e.preventDefault()
    let temp = document.getElementById("ex4Temp").value;
    document.getElementById("ex4Result").innerHTML = FahrenheitToDegrees(temp).toString();
})

document.getElementById("ex5Submit").addEventListener("click", function (e) {
    e.preventDefault()
    let timezone = document.getElementById("ex5Timezone").value.toLowerCase();
    let hour = document.getElementById("ex5Hour").value;
    let minute = document.getElementById("ex5Minute").value;
    document.getElementById("ex5TimezoneO").innerHTML = timezone;
    let output = TimezoneHour(timezone, hour, minute);
    document.getElementById("ex5Result").innerHTML = output.hour + ":" + output.minute;
})