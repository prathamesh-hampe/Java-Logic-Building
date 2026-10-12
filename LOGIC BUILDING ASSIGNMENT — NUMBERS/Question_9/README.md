# Q9 - Voting Machine ID Validation 🗳️

## Problem Statement

A digital voting machine accepts a voter ID only if it contains more than 5 digits.

- If the digit count is greater than 5, display `Accepted`.
- Otherwise, display `Rejected`.
- Negative numbers are automatically rejected.

## Input

An integer `voterID`

## Output

Display `Accepted` or `Rejected`.

## Examples

|   Input   |   Output   |
|-----------|------------|
|  123456   |  Accepted  |
|  56789    |  Rejected  |
|  -123456  |  Rejected  |