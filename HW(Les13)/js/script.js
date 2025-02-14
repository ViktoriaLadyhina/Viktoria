console.log("Homework (Lesson 13)");

// создание поля ввода и кнопки
const bodyElem = document.querySelector("body");

const mainElem = document.createElement("main");
bodyElem.append(mainElem);

const formDiv = document.createElement("div");
formDiv.classList.add("forma");
mainElem.append(formDiv);

const formInput = document.createElement("form");
formInput.classList.add("fInput");
formDiv.append(formInput);

const inputField = document.createElement("input");
inputField.setAttribute("type", "text");
inputField.setAttribute("placeholder", "Введите id продукта");
formInput.append(inputField);

const submitButton = document.createElement("button");
submitButton.setAttribute("type", "submit");
submitButton.innerText = "Показать";
formInput.append(submitButton);

// Создаем контейнер для карточки продукта
const productContainer = document.createElement("div");
mainElem.append(productContainer);

// функция, которая получает данные с сервера
function getProductByID(id, callback) {
    fetch(`https://dummyjson.com/products/${id}`)
        .then((response) => { return response.json() })
        .then((data) => { callback(data) })
        .catch((error) => { console.log(error) });
}
// получение значения из поля ввода
formInput.addEventListener("submit", function (event) {
    event.preventDefault();
    const productId = inputField.value;

// удаление старой карты
productContainer.innerHTML = '';

// запускаем функцию 
    getProductByID(productId, (user) => {

// создание карточки 
        const persCardDiv = document.createElement("div");
        persCardDiv.classList.add("person_card");
        productContainer.append(persCardDiv);

        const imageDiv = document.createElement("div");
        imageDiv.classList.add("image");
        persCardDiv.append(imageDiv);

        const fotoElem = document.createElement("img");
        fotoElem.setAttribute("alt", "foto");
        fotoElem.setAttribute("src", user.images[0])
        imageDiv.append(fotoElem);

        const title = document.createElement("h3")
        title.classList.add("title")
        title.innerText = user.title;
        persCardDiv.append(title);

        const textDiv = document.createElement("div");
        textDiv.classList.add("text");
        persCardDiv.append(textDiv);

        const stockElem = document.createElement("p");
        stockElem.classList.add("stock");
        stockElem.innerText = `Stock: ${user.stock}`
        textDiv.append(stockElem);

        const priceElem = document.createElement("p");
        priceElem.classList.add("price");
        priceElem.innerText = `Price: $${user.price}`
        textDiv.append(priceElem);

// функция получения среднего числа rating        
        const ratingValue = user.reviews.reduce(function (acc, el) {
            return acc += el.rating / user.reviews.length
        }, 0)

        const ratingElem = document.createElement("p");
        ratingElem.classList.add("rating");
        ratingElem.innerText = `Rating AVG: ${Math.round(ratingValue)}`
        textDiv.append(ratingElem);

        const categoryElem = document.createElement("p");
        categoryElem.classList.add("category");
        categoryElem.innerText = `Category: ${user.category}`
        textDiv.append(categoryElem);

    })

})