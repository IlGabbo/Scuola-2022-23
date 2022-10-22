let w = window.innerWidth;
let h = window.innerHeight;

function setup() {
    createCanvas(w, h);
    background("gray");
}

function draw() {
    stroke("blue");
    noFill();
    circle(w/2-80, h/2-20, 60);

    noFill();
    stroke("yellow");
    circle(w/2-40, h/2, 60);

    noFill();
    stroke("black");
    circle(w/2, h/2-20, 60);

    noFill();
    stroke("green");
    circle(w/2+40, h/2, 60);

    noFill();
    stroke("red");
    circle(w/2+80, h/2-20, 60);
}