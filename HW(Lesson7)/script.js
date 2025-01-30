// ДЗ
// Легкие задачи:
console.log("--- Task 1 ---");
// 1. Дан массив чисел [12, 5, 8, 130, 44]. Создайте новый массив, содержащий только числа больше 10.
let arr = [12, 5, 8, 130, 44];
let task1 = arr.filter(function (value) {
    return value > 10
})
console.log(task1);

console.log("--- Task 2 ---");
// 2. Напишите программу, которая принимает массив строк и возвращает массив длин этих строк по возрастанию.
// ["one", "three", "two"] -> [3, 5, 3] -> [3, 3, 5]
let arr2 = ["one", "three", "two"];
let task2 = arr2.map(function (value) {
    return value.length
})
task2.sort(function (a, b) {
    return a - b;
})
console.log(task2);

console.log("--- Task 3 ---");
// 3. Есть массив строк. Отсортируйте строки по их длине (от самой короткой к самой длинной) и выведите результат.
// ['hello', 'world', 'javascript', 'code'] => ['code', 'hello', 'world', 'javascript']
let arr3 = ['hello', 'world', 'javascript', 'code'];
arr3.sort(function (a, b) {
    return a.length - b.length;
})
console.log(arr3);

// Средной сложности задачи:

console.log("--- Task 4 ---");
// 4. Подсчитайте количество гласных букв в строке. Выведите результат.
// "hello" -> 2
// "javascript" -> 3
// "world" -> 1
let vowels = ['a', 'e', 'i', 'o', 'u'];
let task4 = ["hello", "javascript", "world"];
let count = 0;
task4.forEach(function (val) {
    let word = val.split("")
    word.forEach(function (elword) {
        vowels.forEach(function (elvovels) {
            if (elvovels === elword) {
                count++;
            }
        })
    })
    console.log(val + " - " + count);
    count = 0;
})

console.log("--- Task 5 ---");
// 5. Дана строка. Отсортировать её символы в алфавитном порядке.
// "javascript"-> "aacijprstv"
// "hello" -> "ehllo"
str5 = "javascript";
str5_2 = "hello";
let task5_1 = str5.split("").sort().join("");
let task5_2 = str5_2.split("").sort().join("");
console.log(task5_1);
console.log(task5_2);


// Сложные задачи:

console.log("--- Task 6 ---");
// 6. Есть произвольная строка, определите, сколько раз каждый символ встречается в этой строке. Выведите результат в формате: "Символ X => Y".
// // "hello"
// Символ h => 1
// Символ e => 1
// Символ l => 2
// Символ o => 1
let str6 = "hello";
let task6 = str6.split("");
let count6 = 0;

task6.forEach(function (value, index) {
    count6++;
    task6.forEach(function (value2, index2) {
        if (value == value2 && index != index2) {
            count6++;
        }
    })
    console.log(`Символ ${value} ==> ${count6}`);
    count6 = 0;
})

console.log("--- Task 7 ---");
// 7. Дан массив чисел [3, 1, 4, 1, 5, 9]. Найдите сумму квадратов всех четных чисел.
let arr7 = [3, 1, 4, 1, 5, 9];
let filtrArr7 = arr7.filter(function (value) {
    if (value % 2 === 0) {
        return value;
    }
})
let squareArr7 = filtrArr7.map(function (value) {
    return value ** 2;
})
let task7 = squareArr7.reduce(function (sum, value) {
    return sum + value
})
console.log(task7);

console.log("--- Task 8 ---");
// 8. Дан массив чисел. Проверить, упорядочены ли элементы по возрастанию.
// [1, 5, 9, 12, 36] => true
// [1, 5, 12, 9, 36, -5] => false
let arr8 = [1, 5, 9, 12, 36];
let ordArr = true;
arr8.forEach(function (value) {
    arr8.forEach(function (value2) {
        if (value > (value2 + 1))
            ordArr = false
    })
})
console.log("[" + arr8 + "] => " + ordArr);

let arr8_2 = [1, 5, 12, 9, 36, -5];
let bool2 = true;
arr8_2.forEach(function (value) {
    arr8_2.forEach(function (value2) {
        if (value > (value2 + 1))
            bool2 = false
    })
})
console.log(`[${arr8_2}] => ${bool2}`);

console.log("--- Task 9 ---");
// 9. Дан массив слов. Создайте объект, где ключами будут первые буквы слов, а значениями — массивы слов, начинающихся на эти буквы. Например։
// ['apple', 'banana', 'apricot', 'blueberry', 'cherry'] ->
// {
//    a: ['apple', 'apricot'],
//    b: ['banana', 'blueberry'],
//    c: ['cherry']
// }

// увы, смогла решить только с помощью чата GPT, не могу до конца понять синтаксис добавдения новых значений в объект - мы добавляем новые значение в массив, который находится в объекте, поэтому через push, но добавление ключа в квадратных скобках для меня не полностью понятен...

let arr9 = ['apple', 'banana', 'apricot', 'blueberry', 'cherry'];

let task9 = {};

arr9.forEach(function(word) {
    let firstLetter = word[0]
    if (!task9[firstLetter]) {
        task9[firstLetter] = []; 
    }
    task9[firstLetter].push(word); 
});

console.log(task9);