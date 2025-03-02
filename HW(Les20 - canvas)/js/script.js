console.log("Homework (Lesson 20)");

// Создать класс Person который получает размеры и отрисовавает красный прямоугольник
// moveTop
// moveDown
// moveLeft
// moveRight
// которые на 5 пикселей двигают персонажа в соотвествующей направлении
// при нажатии на стрелочки двигать прямоугольник

const canvasElem = document.querySelector("canvas")
const ctx = canvasElem.getContext("2d")


class Person {
    constructor(width, height) {
        this.width = width;
        this.height = height;
        this.x = 100;
        this.y = 100;
    }

    creatTriangle() {
        ctx.beginPath()
        ctx.fillStyle = "red"
        ctx.strokeStyle = "red"
        ctx.moveTo(this.x,                  this.y)
        ctx.lineTo(this.x,                  this.y + this.height)
        ctx.lineTo(this.x + this.width,     this.y + this.height)
        ctx.lineTo(this.x,                  this.y)
        ctx.stroke()
        ctx.fill()
    }

    moveTop() {
        this.y -= 5;
        this.clear();
    }

    moveDown() {
        this.y += 5;
        this.clear();
    }

    moveLeft() {
        this.x -= 5;
        this.clear();
    }

    moveRight() {
        this.x += 5;
        this.clear();
    }

    clear(){
        ctx.clearRect(0, 0, canvasElem.width, canvasElem.height);
        this.creatTriangle();
    }
}


const person = new Person(400, 300);
person.creatTriangle()


const upArrow = document.querySelector(".top");
upArrow.addEventListener("click", function(){
    person.moveTop();
})

const downArrow = document.querySelector(".down");
downArrow.addEventListener("click", function(){
    person.moveDown();
})

const leftArrow = document.querySelector(".left");
leftArrow.addEventListener("click", function(){
    person.moveLeft();
})

const rightArrow = document.querySelector(".right");
rightArrow.addEventListener("click", function(){
    person.moveRight();
})