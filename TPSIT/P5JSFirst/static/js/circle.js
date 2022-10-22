let w = window.innerWidth;
let h = window.innerHeight;

function setup() {
    createCanvas(w, h);
}

function draw() {
    circle(w/2, h/2, 60);
    fill("red")
    stroke("yellow");
}