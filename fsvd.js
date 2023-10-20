function reverseWords(sentence) {
    return sentence.split(' ').map(function(word) {
        return word.split('').reverse().join('');
    }).join(' ');
}

// Example usage
var inputSentence = "This is a sunny day";
var reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);
