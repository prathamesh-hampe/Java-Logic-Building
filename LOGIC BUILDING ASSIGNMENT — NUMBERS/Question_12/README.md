# Q12 - Fraud Detection — Palindrome Transaction 🔍

## Problem Statement

A fraud detection engine flags transactions that read the same forward and backward as potentially suspicious.

A transaction number is considered a **Palindrome** if it reads the same from left to right and right to left.

**Rule:** Negative numbers are automatically considered `Not Palindrome`.

## Input

An integer `transactionNumber`

## Output

Display `Palindrome` or `Not Palindrome`.

## Examples

| Input  |      Output      |
|--------|------------------|
|  121   |    Palindrome    |
|  1331  |    Palindrome    |
|  -121  |  Not Palindrome  |
|  123   |  Not Palindrome  |