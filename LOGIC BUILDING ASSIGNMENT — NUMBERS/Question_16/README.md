# Q16 - Banking Checksum — Sum of Even Digits 🏦

## Problem Statement

A banking system validates account numbers using a simple checksum rule.

It calculates the sum of all even digits present in the account number to perform secondary verification.

Your task is to compute the sum of all even digits in the given integer.

### Rules

- Consider the absolute value for negative numbers.
- If no even digits exist, return `0`.

## Input

An integer `accountNumber`

## Output

Display `Sum of Even Digits: X`, where `X` is the sum of all even digits.

## Examples

|   Input  |         Output           |
|----------|--------------------------|
|  123456  |  Sum of Even Digits: 12  |
|   13579  |  Sum of Even Digits: 0   |
|   -248   |  Sum of Even Digits: 14  |