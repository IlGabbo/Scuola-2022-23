function factorial(num) {
    if (num < 0)
        return -1;
    else if (num === 0)
        return 1;
    else {
        return (num * factorial(num -1));
    }
}

function modulo(num) {
    if (num % 2 == 0)

}

let input = parseInt(prompt("Enter a number"));
if (input != "NaN")
    alert(factorial(input).toString());