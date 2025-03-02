console.log("Homework (Lesson 20)");

// я немного усложнила для себя задание - должно быть два класса - треугольник и прямоугольник, которые наследуюься от класса Фигура. В классе Фигура - методы сдвигов (кнопки) и кнопки переключения между фигурами. 
// Не могу понять почему в кнопки переключения не вставился i-элемент, хотя работают....
// при создании экземпляра указывается размер и цвет фигур.

const canvasElem = document.querySelector("canvas")
const ctx = canvasElem.getContext("2d")

class Figure {
    constructor(){
        this.x = 100;
        this.y = 100;
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

    clear() {
        ctx.clearRect(0, 0, canvasElem.width, canvasElem.height);
    }
}

class Triangle extends Figure {
    constructor(width, height, color) {
        super()
        this.width = width;
        this.height = height;
        this.color = color;
    }

    creatTriangle() {
        ctx.beginPath()
        ctx.fillStyle = this.color
        ctx.moveTo(this.x, this.y)
        ctx.lineTo(this.x, this.y + this.height)
        ctx.lineTo(this.x + this.width, this.y + this.height)
        ctx.lineTo(this.x, this.y)
        ctx.stroke()
        ctx.fill()
    }

    clear() {
        super.clear(this.x, this.y)
        this.creatTriangle();
    }
}

class Rectangle extends Figure {
    constructor(width, height, color) {
        super();
        this.width = width;
        this.height = height;
        this.color = color;
    }

    creatRectangle() {
        ctx.fillStyle = this.color
        ctx.fillRect(this.x, this.y, this.width, this.height)
    }

    clear() {
        super.clear(this.x, this.y)
        this.creatRectangle();
    }
}


const triangle = new Triangle(400, 300, "red");
const rectangle = new Rectangle(400, 300, "green");



// кнопки для переключения фигур
let curFigure = triangle;
const switchingTriangle = document.querySelector(".triangle")
switchingTriangle.addEventListener("click", function(){
    curFigure = triangle;
    curFigure.clear();
})

const switchingRectangle = document.querySelector(".rectangle")
switchingRectangle.addEventListener("click", function(){
    curFigure = rectangle;
    curFigure.clear();
})


// кнопки для сдвига фигуры
const upArrow = document.querySelector(".top");
upArrow.addEventListener("click", function () {
    curFigure.moveTop();
})

const downArrow = document.querySelector(".down");
downArrow.addEventListener("click", function () {
    curFigure.moveDown();
})

const leftArrow = document.querySelector(".left");
leftArrow.addEventListener("click", function () {
    curFigure.moveLeft();
})

const rightArrow = document.querySelector(".right");
rightArrow.addEventListener("click", function () {
    curFigure.moveRight();
})