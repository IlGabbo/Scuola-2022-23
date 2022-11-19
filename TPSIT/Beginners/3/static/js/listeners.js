document.getElementById("ex3Submit").addEventListener("click", function (e) {
    e.preventDefault()
    let hours = document.getElementById("ex3Hours").value;
    let minutes = document.getElementById("ex3Minutes").value;
    document.getElementById("ex3Result").innerHTML = GetMilliseconds(hours, minutes).toString();
})