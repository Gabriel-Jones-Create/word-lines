# WordLines

For this assignment you are to create a one class Java application called WordLines that reads in a line of text from the keyboard, and then prints to the console the words in the line, each on a separate display line. Finally, your program should print the number of non-blank characters on the line. For example, if this is the entered line:

```
> here is   the hill-top!

your program should print:

here
is

the
hill-top!
Your input has 18 non-blank characters.
```

Notice that in the sample output, there is an extra blank line (2 instead of 1) between "is" and "the", because there are two spaces between these words in the input. This is ok, but not absolutely necessary; just having different words on different lines is acceptable. Finally, note that both the "-" and the "!" are counted in the reported character count. You should count all punctuation in this way in your solution.

## Tip: Scanner

Use [Scanner](https://www.w3schools.com/java/java_user_input.asp) to read from the keyboard.

If
`scan`

is a Scanner object, then
`String inputStr = scan.nextLine();`

will read an entire line from the keyboard, and copy it to the String inputStr.
