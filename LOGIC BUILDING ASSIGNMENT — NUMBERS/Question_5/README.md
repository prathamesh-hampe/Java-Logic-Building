# Q5 - Divisibility Security Check 🛡️

## Problem Statement

A payment security gateway validates numeric entries before approval.

A number is considered **Valid** only if:

- It is divisible by `3`
- AND
- It is divisible by `5`

If both conditions are satisfied:

```text
Valid Number

Otherwise:
Invalid Number

Input
An integer num

Output
Valid Number or Invalid Number

Examples

| Input |      Output      |
|-------|------------------|
|  15   |  Valid Number    |
|  30   |  Valid Number    |
|  9    |  Invalid Number  |
|  10   |  Invalid Number  |
