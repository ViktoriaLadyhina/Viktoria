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
function countLenghtStr(str) {
    let task2 = str.map(str => str.length).sort((a, b) => a - b)
    return task2;
}
console.log(countLenghtStr(arr2));

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
function task5(str) {
    let task5 = str.split("").sort().join("");
    return task5;
}

console.log(task5("javascript"));
console.log(task5("hello"));

// Сложные задачи:

console.log("--- Task 6 ---");
// 6. Есть произвольная строка, определите, сколько раз каждый символ встречается в этой строке. Выведите результат в формате: "Символ X => Y".
// // "hello"
// Символ h => 1
// Символ e => 1
// Символ l => 2
// Символ o => 1

function countChar(str) {
    let tmp = {};
    let char = '';
    str.split("").forEach(function (value) {
        char = value;
        if (tmp[char]) {
            tmp[char]++;
        } else {
            tmp[char] = 1;
        }
    });
    str.split("").forEach(function (value) {
        char = value;
        if (tmp[char] && tmp[char] > 0) {
            console.log(`Символ ${char} => ${tmp[char]}`);
            tmp[char] = 0;
        }
    })
}
countChar("hello");

console.log("--- Task 7 ---");
// 7. Дан массив чисел [3, 1, 4, 1, 5, 9]. Найдите сумму квадратов всех четных чисел.
let arr7 = [3, 1, 4, 1, 5, 9];
let task7 = arr7.reduce(function (sum, value) {
    if (value % 2 === 0) {
        return sum + value ** 2;
    } else {
        return sum;
    }
}, 0)
console.log(task7);

console.log("--- Task 8 ---");
// 8. Дан массив чисел. Проверить, упорядочены ли элементы по возрастанию.
// [1, 5, 9, 12, 36] => true
// [1, 5, 12, 9, 36, -5] => false

function ordAr(arr) {
    let ordArr = true;
    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1])
            ordArr = false;
    }
    console.log(`[${arr}] => ${ordArr}`);
}
let arr8 = [1, 5, 9, 12, 36];
let arr8_2 = [1, 5, 12, 9, 36, -5];
ordAr(arr8);
ordAr(arr8_2);

console.log("--- Task 9 ---");
// 9. Дан массив слов. Создайте объект, где ключами будут первые буквы слов, а значениями — массивы слов, начинающихся на эти буквы. Например։
// ['apple', 'banana', 'apricot', 'blueberry', 'cherry'] ->
// {
//    a: ['apple', 'apricot'],
//    b: ['banana', 'blueberry'],
//    c: ['cherry']
// }

let arr9 = ['apple', 'banana', 'apricot', 'blueberry', 'cherry'];

let task9 = {};
arr9.forEach(function (word) {
    let firstLetter = word[0]
    if (!task9[firstLetter]) {
        task9[firstLetter] = [];
    }
    task9[firstLetter].push(word);
});

console.log(task9);