let w = 600;
let h = 600;
let squareW = 10;
let j = squareW
let i = squareW

function setup() {
    createCanvas(w, h)
    background(220);
}

function draw() {
    +
        drawSquares().next()
}

function* drawSquares() {
    /*
    for (i; i < (w / squareW) * squareW; i += squareW * 2) {
        for (j; j < (h / squareW) * squareW; j += squareW * 2) {
            circle(i, j, 8);
            yield;
        }
    }
    
    I giglocommenti
    
    */
    while (j < h) {
        circle(i, j, 8);
        if (i > h) {
            j += squareW * 2
            i = squareW
        }
        i += squareW * 2
        yield;
    }
}
