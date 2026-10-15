# Q11 - Reverse Transaction Number 🔄

## Problem Statement

A financial processing system stores transaction IDs as integers. Before processing, the system reverses the transaction number to apply an internal encoding rule.

You are required to reverse the digits of the given integer.

### Rules

- Preserve the sign of the number.
- Leading zeros after reversal must be removed.
- If the input is `0`, the output should be `0`.

## Input

An integer `num`

## Output

Display the reversed integer.

## Constraints

\[
-10^9 \leq num \leq 10^9
\]

## Examples

| Input  | Output |
|--------|--------|
|  1234  |  4321  |
|  -560  |  -65   |
|  1000  |   1    |
|   0    |   0    |