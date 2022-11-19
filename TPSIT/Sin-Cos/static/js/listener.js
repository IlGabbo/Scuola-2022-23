let amplitudeInput = document.querySelector("[name=amplitude]");

amplitudeInput.addEventListener("input", function (e) {
    amplitude = parseInt(amplitudeInput.value);
})

let phaseInput = document.querySelector("[name=phase]");

phaseInput.addEventListener("input", function (e) {
    phase = parseInt(phaseInput.value);
})

let frequencyInput = document.querySelector("[name=frequency]");

frequencyInput.addEventListener("input", function (e) {
    frequency = parseInt(frequencyInput.value);
})

let resetInput = document.querySelector("[name=reset]");

resetInput.addEventListener("click", function (e) {
    e.preventDefault();
    resetDrawing();
})