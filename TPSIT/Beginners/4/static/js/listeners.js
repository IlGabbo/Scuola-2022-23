document.getElementById("ex4Submit").addEventListener("click", function (e) {
    e.preventDefault()
    let temp = document.getElementById("ex4Temp").value;
    document.getElementById("ex4Result").innerHTML = FahrenheitToDegrees(temp).toString();
})