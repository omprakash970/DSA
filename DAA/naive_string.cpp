#include<bits/stdc++.h>
using namespace std; 
/**
 * Naively searches for all occurrences of `pattern` within `text` and reports
 * each match by printing its starting index to std::cout.
 *
 * How it works:
 * - Let n = text.length() and m = pattern.length().
 * - For every alignment i from 0 to n - m, compare characters text[i + j] with pattern[j].
 * - If any character mismatches, the inner loop breaks and the next alignment is tried.
 * - The line `if (j == m - 1)` inside the inner loop means: "we have just successfully
 *   matched the last character of the pattern at this alignment", so a full match is found
 *   and index i is printed.
 *
 * Parameters:
 * - text: The string to search within (haystack).
 * - pattern: The substring to find (needle).
 *
 * Output:
 * - For each full match, prints: "Pattern found at index <i>" using zero-based indexing.
 * - No return value; side-effect is writing to std::cout.
 *
 * Complexity:
 * - Time: O(n * m) in the worst case, where n = text.size() and m = pattern.size().
 * - Space: O(1) auxiliary space.
 *
 * Notes and edge cases:
 * - Overlapping matches are reported (e.g., "aaa" with "aa" yields indices 0 and 1).
 * - If pattern is empty (m == 0), the inner loop never runs and no matches are reported.
 * - If m > n, the outer loop does not execute and no output is produced.
 * - The standalone `int j;` before the inner loop is unused; the loop declares its own `j`.
 * - Matching is exact and case-sensitive; no wildcards or preprocessing are applied.
 */
void naive_string_matching(string text, string pattern){
    int n=text.length();
    int m=pattern.length();
    for(int i=0;i<=n-m;i++){
        int j; 
        for(int j=0;j<m;j++){
            if(text[i+j]!=pattern[j]){
                break;
            }
            if(j==m-1){
                cout<<"Pattern found at index "<<i<<endl;
            }
        }
    }
}
int main(){
    string text, pattern;
    cout<<"Enter the text: ";
    getline(cin, text);
    cout<<"Enter the pattern: ";
    getline(cin, pattern);
    naive_string_matching(text, pattern);
    return 0;   
}