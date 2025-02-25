console.log("Homework (Lesson 16)");


console.log("----- Задание 1 -----");

class Car {
    constructor(mark, model, year) {
        this.mark = mark
        this.model = model
        this.year = year // год выпуска
    }

    age(currentYear) { // year - сегодняшний год
        return currentYear - this.year
    }
}

// создание экземпляра класса Car
let car1 = new Car('Opel', 'Astra', 2015, 'opel@gmail.com')
console.log(car1);

// проверка метода вычисления возраста машины
console.log(car1.age(2025));


console.log("----- Задание 2 -----");
class Person {

    constructor(firstname, lastName, age, balance, email) {
        this.firstname = firstname
        this.lastName = lastName
        this.age = age
        this.balance = balance
        this.email = email
    }

    change_email(email) {
        if (email.includes('@') && email.includes('.')) {
            this.email = email
            return
        }
        throw new Error("Некорректный email")
    }
}

// создание экземпляра класса Person
let pers = new Person("Ary", "Osk", 20, 120, 'opel@gmail.com')
console.log(pers);

// проверка работы метода change_email
// car1.change_email('kjoli;k')
pers.change_email('opel2@gmail.com')
console.log(pers);


console.log("----- Задание 3 -----");
// 3. Создайте класс Library, который хранит статический массив книг. 
// Каждая книга – это объект с свойствами title и author. Добавьте 
// статический метод addBook(book), который добавляет книгу в библиотеку, 
// и статический метод listBooks(), который выводит список книг в консоль.
class Library {
    static books = []

    static addBook(book) {
        Library.books.push(book)
    }

    static listBooks() {
        console.log(this.books);
    }
}

// проверка работы метода addBook
Library.addBook(
    {
        Autor: 'Дэвид Флэнаган',
        Title: 'JavaScript. Полное руководство. Седьмое издание'
    })
Library.addBook(
    {
        Autor: 'Марейн Хавербеке',
        Title: 'Выразительный JavaScript. Современное веб-программирование. Третье издание',

    })

// проверка работа метода listBooks 
Library.listBooks()


console.log("----- Задание 4 -----");
class Rectangle {
    #width = 0
    #height = 0

    constructor(width, height) {
        this.width = width
        this.height = height
    }

    get width() {
        return this.#width
    }

    set width(value) {
        if (value > 0) {
            this.#width = value
        } else {
            throw new Error("Ширина должна быть выше нуля")
        }
    }

    get height() {
        return this.#height
    }

    set height(value) {
        if (value > 0) {
            this.#height = value
        } else {
            throw new Error('Длина должна быть выше нуля')
        }
    }

    area() {
        return this.width * this.height;
    }
}

// создание экземпляра класса Rectangle
let rectangle = new Rectangle(215, 50)

// проверка работы set width 
rectangle.width = 115

// проверка работы set height
rectangle.height = 100

console.log(rectangle);

// проверка работы area
console.log(rectangle.area());


console.log("----- Задание 5 -----");
class BankAccount {
    #balance = 0
    static accounts = []

    constructor(bal) {
        this.#balance = bal

        BankAccount.accounts.push(this)
    }

    // метод депозита ----??
    set balance(value) {
        this.#balance = value
    }

    // геттер для получения текущего баланса
    get balance() {
        return this.#balance
    }

    // метод снятия средства
    withdrawalOfFunds(value) {
        if (value < this.#balance) {
            this.#balance = this.#balance - value
        } else {
            throw new Error('У вас нет таких средств')
        }
    }

    // статический метод для расчёта общего баланса всех счетов.
    static sum_balance() {
        return BankAccount.accounts.reduce((acc, user) =>
            acc + user.balance, 0)
    }
}

// создание экземпляров класса BankAccount
let cust1 = new BankAccount(100)
let cust2 = new BankAccount(85)
console.log(cust1);

// проверка метода снятия средства 
cust1.withdrawalOfFunds(50)
console.log(cust1);

// проверка массива с клиентами:
console.log(BankAccount.accounts);

// проверка метода подсчета суммы баланса все клиентов
console.log(BankAccount.sum_balance());