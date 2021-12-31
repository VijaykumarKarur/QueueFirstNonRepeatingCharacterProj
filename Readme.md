<h4>First non-repeating character</h4>
<hr/>

<b>Problem Description</b>

Given a string A denoting a stream of lowercase alphabets.

You have to make new string B. B is formed such that we have to find first non-repeating character each time a character is inserted to the stream and append it at the end to B. if no non-repeating character is found then append '#' at the end of B.

<hr/>

<b>Problem Constraints</b>

1 <= |A| <= 100000
<hr/>


<b>Input Format</b>

The only argument given is string A.

<hr/>

<b>Output Format</b>

Return a string B after processing the stream of lowercase alphabets A.

<hr/>

<b>Example Input</b>

Input 1:

A = "abadbc"
Input 2:

A = "abcabc"
<hr/>

<b>Example Output</b>

Output 1:

"aabbdd"
Output 2:

"aaabc#"
<hr/>

<b>Example Explanation</b>

Explanation 1:

"a"      -   first non repeating character 'a'<br/>
"ab"     -   first non repeating character 'a'<br/>
"aba"    -   first non repeating character 'b'<br/>
"abad"   -   first non repeating character 'b'<br/>
"abadb"  -   first non repeating character 'd'<br/>
"abadbc" -   first non repeating character 'd'<br/>

Explanation 2:

"a"      -   first non repeating character 'a'<br/>
"ab"     -   first non repeating character 'a'<br/>
"abc"    -   first non repeating character 'a'<br/>
"abca"   -   first non repeating character 'b'<br/>
"abcab"  -   first non repeating character 'c'<br/>
"abcabc" -   no non repeating character so '#'<br/>
