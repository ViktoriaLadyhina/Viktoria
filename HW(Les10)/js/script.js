console.log("Homework");

let product = {
    title: "Велосипед",
    img: "../media/velocipede.jpg",
    count: 10,
    favorite: false
}

let title = product.title;
let htmlH2 = document.querySelector("h2");
htmlH2.innerText = title

let foto = product.img;
let htmlImg = document.querySelector("img")
htmlImg.setAttribute("src", foto)

let countValue = product.count
let htmlCount = document.querySelector("span");
htmlCount.innerText = countValue;

countValue = !!localStorage.getItem("count") ? localStorage.getItem("count") : 0
htmlCount.innerText = countValue;

let btnPlus = document.querySelector("#plus")
btnPlus.addEventListener("click", function() {
    countValue++
    htmlCount.innerText = countValue
    localStorage.setItem("count", countValue)
})

let btnMinus = document.querySelector("#minus")
btnMinus.addEventListener("click", function () {
    countValue--
    htmlCount.innerText = countValue
    localStorage.setItem("count", countValue)
})

localStorage.setItem("product", JSON.stringify(product))
let star = document.querySelector(".star")
star.addEventListener("click", function () {
    let jsonProduct = JSON.parse(localStorage.getItem("product"));
    jsonProduct.favorite = !jsonProduct.favorite
    localStorage.setItem("product", JSON.stringify(jsonProduct))
})
