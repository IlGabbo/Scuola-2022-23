let accelXList = document.querySelector("[name=accelX]");

accelXList.addEventListener("input", function (e) {
    accelX = parseFloat(accelXList.value);
})

let accelYList = document.querySelector("[name=accelY]");

accelYList.addEventListener("input", function (e) {
    accelY = parseFloat(accelYList.value);
})