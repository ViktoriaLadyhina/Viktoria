console.log("Homework");

let product = {
    title: "Велосипед",
    img: "media/velocipede.jpg",
    count: 10,
    favorite: false
}

let title = product.title;
let htmlH2 = document.querySelector("h2");
htmlH2.innerText = title;

let foto = product.img;
let htmlImg = document.querySelector("img");
htmlImg.setAttribute("src", foto);

let jsonProduct = localStorage.getItem("product") ? JSON.parse(localStorage.getItem("product")) : product;
product.favorite = jsonProduct.favorite;

let star = document.querySelector("i");

if (localStorage.getItem("starColor") !== null) {
    star.setAttribute("data-color", localStorage.getItem("starColor"));
} else {
    star.setAttribute("data-color", "dark");
    localStorage.setItem("starColor", "dark");
}

if (jsonProduct.favorite) {
    star.setAttribute("data-color", "light");
} else {
    star.setAttribute("data-color", "dark");
}

let countValue = localStorage.getItem("count") ? parseInt(localStorage.getItem("count")) : product.count;
let htmlCount = document.querySelector("span");
htmlCount.innerText = countValue;

let btnPlus = document.querySelector("#plus");
btnPlus.addEventListener("click", function() {
    countValue++;
    htmlCount.innerText = countValue;
    localStorage.setItem("count", countValue);
});

let btnMinus = document.querySelector("#minus");
btnMinus.addEventListener("click", function() {
    countValue--;
    htmlCount.innerText = countValue;
    localStorage.setItem("count", countValue);
});

localStorage.setItem("product", JSON.stringify(product));

star.addEventListener("click", function() {
    let jsonProduct = JSON.parse(localStorage.getItem("product"));
    jsonProduct.favorite = !jsonProduct.favorite;
    localStorage.setItem("product", JSON.stringify(jsonProduct));

    if (star.getAttribute("data-color") === "dark") {
        star.setAttribute("data-color", "light");
        localStorage.setItem("starColor", "light");
    } else {
        star.setAttribute("data-color", "dark");
        localStorage.setItem("starColor", "dark");
    }
});