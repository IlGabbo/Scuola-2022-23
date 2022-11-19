document.getElementById("ex5Submit").addEventListener("click", function (e) {
    e.preventDefault()
    let timezone = document.getElementById("ex5Timezone").value.toLowerCase();
    let hour = document.getElementById("ex5Hour").value;
    let minute = document.getElementById("ex5Minute").value;
    document.getElementById("ex5TimezoneO").innerHTML = timezone;
    let output = TimezoneHour(timezone, hour, minute);
    document.getElementById("ex5Result").innerHTML = output.hour + ":" + output.minute;
})