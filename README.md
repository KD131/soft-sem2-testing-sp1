# Assignment 1

I'm not putting all my code in the README if that's what you were expecting. That's lunacy.

- [1. Reflections](#1-reflections)
    - [1.1. Shooting](#11-shooting)
    - [1.2. Alien](#12-alien)
- [2. Two Katas](#2-two-katas)
    - [2.1. Fahrenheit-To-Celsius Converter](#21-fahrenheit-to-celsius-converter)
    - [2.2. Roman Numeral Kata](#22-roman-numeral-kata)
- [3. Give Your Thoughts On TDD](#3-give-your-thoughts-on-tdd)

## 1. Reflections

### 1.1. Shooting

> A woman fired a shot at a man with her gun, but the man did not die. List the possible reasons for the man not dying.

The first couple reasons contradict the fact that *a shot was fired*, but they're worth mentioning.

1. Safety on
2. Out of bullets/no ammunition
3. Blanks
4. Misfire
5. Missed the target
6. Non-fatal wound
7. Superman/cheats enabled
8. Water gun

### 1.2. Alien

> An alien meets you, and it asks you to teach it how to brush its teeth. Assume that the alien has teeth exactly like
> yours, and is as smart as you, but it needs a clear step-by-step instruction. List the steps. Be as detailed as you
> can. (Example: Hold the toothpaste with your left hand; turn the cap anti-clockwise)

1. Pick up toothbrush in your dominant hand.
2. Stick the tip of the toothbrush in running water to wet the bristles.
3. Pick up tube of toothpaste.
4. Unscrew cap of toothpaste by turning the cap anti-clockwise.
5. Position the tip of the tube along the bristles of the toothbrush.
6. Squeeze the tube to spread toothpaste unto the bristles.
7. Wet the bristles again, now with the toothpaste on it.
8. Stick the tip of the toothbrush into your mouth along your bottom teeth.
9. Gently make circular motions along the row of teeth.
10. Also do the backside of the teeth.
11. Repeat steps 8-10 for the top row of teeth.
12. Spit out remaining toothpaste into a sink.
13. Wash tip of the toothbrush.
14. Put away toothbrush and toothpaste.

## 2. Two Katas

Complete the following two katas using TDD. Make sure to follow the TDD mantra,
“red-green-refactor”:

- Red: Write a failing test.
- Green: Write the smallest implementation to make your test pass.
- Refactor: Make the necessary refactoring to the implementation and tests, in order to remove code redundancy

A fuller explanation of the TDD steps can be found here:  
https://en.wikipedia.org/wiki/Test-driven_development2

Remember, the point of these katas is not to solve the coding tasks as such. The point
is to *use TDD*. Thus, if your code contains a solution to the task, but no tests, the
solution is not accepted.

### 2.1. Fahrenheit-To-Celsius Converter

Use TDD to create a fahrenheit-to-celsius converter.  
Use TDD to extend it to a celsius-to-fahrenheit converter.

- [Code](/src/main/java/org/example/TemperatureConverter.java)
- [Tests](/src/test/java/org/example/TemperatureConverterTest.java)

### 2.2. Roman Numeral Kata

Implement an “Arabic numeral to roman numeral” converter using TDD. Follow the standard form of roman numerals – the
rules can be found on the wikipedia page:  
https://en.wikipedia.org/wiki/Roman_numerals#Standard_form.

You can test your converter against this online converter:  
http://www.novaroma.org/via_romana/numbers.html.

## 3. Give Your Thoughts On TDD

> - What was positive and good about using TDD?
> - What was annoying or difficult?
> - What surprised you?
> - Did TDD help you write some tests you wouldn't otherwise have thought of?

Writing the simplest solution to pass the test first, in a lot of cases, seems entirely redundant.
There's almost no value in having a function that simply returns `-40` in all cases, so why write that to begin with?

The idea is good, though, in that it forces you to write more tests for more cases to cause your function to fail.

Generally, TDD is useful in that it forces you to write expected outcomes to the code. Like writing a contract for the
code to fulfill.
As you think of more cases to handle, the function becomes more robust.

However, if the function is just a mathematical formula and doesn't contain any logic, like a temperature converter, it
seems less useful to write more test cases for it.
If it works for one number, it'll work for any number if the formula is correct. It's not going to expand the feature
set of the function.
If logic dictates that negative values are invalid, that's a different story and should be tested.

The Roman numeral converter required more logic, so it made more sense to incrementally add it as test cases were
written.
However, I also started out with an idea for the full algorithm, and being forced to write simpler solutions first, only
made it harder to then write the correct thing later.

A good thing about TDD is that it forces you to write testable code.

It also gets you in the mindset of thinking of edge cases and how to handle them, like throwing an exception if the
input is invalid.

As you write more tests, you gain a comprehensive test suite that you can run to verify that your code still works as
intended with no regressions.
