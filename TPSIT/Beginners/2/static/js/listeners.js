document.getElementById("ex2Submit").addEventListener("click", function (e) {
    e.preventDefault()
    let vote = document.getElementById("ex2Vote").value;
    document.getElementById("ex2Result").innerHTML = Vote(vote);
})