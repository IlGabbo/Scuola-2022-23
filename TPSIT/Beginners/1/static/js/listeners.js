document.getElementById("ex1Submit").addEventListener("click", function (e) {
    e.preventDefault()
    let month = document.getElementById("ex1Month").value;
    let year = document.getElementById("ex1Year").value;
    document.getElementById("ex1Result").innerHTML = DaysInMonth(month, year).toString();
})