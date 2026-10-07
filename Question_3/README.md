# Q3 - Transaction ID Digit Counter 💳

## Problem Statement

A financial auditing system needs to verify transaction IDs by counting the number of digits present.

The system must:

- Accept only numbers greater than or equal to `0`.
- Count the total number of digits.
- Print the result in the format:
  `Total Digits: X`
- If the number is negative, print:
  `Invalid Transaction ID`

## Input

An integer `transactionID`

## Output

```text
Total Digits: X

or

Invalid Transaction ID

Examples

| # | Input	|        Output          |
|---|-------|------------------------|
| 1 | 45892 | Total Digits: 5        |
| 2 | 0	    | Total Digits: 1        |
| 3 | -12   | Invalid Transaction ID |