# Q1 - Validating a Banking PIN 🏦

## Problem Statement

A banking application requires users to enter a secure 4-digit Personal Identification Number (PIN) before accessing their account.

Due to increasing fraud attempts, the system must strictly validate the entered PIN before authentication.

The PIN must follow these rules:

- It must contain exactly 4 digits.
- It must be a positive number.
- Leading zeros are allowed only if they are part of a 4-digit format (e.g., `0123` should be treated as invalid if input is integer type).

If the PIN satisfies all conditions, the system should display:

```text
Valid PIN

Otherwise, it should display:
Invalid PIN

Input
An integer pin

Output
Valid PIN 
   or 
Invalid PIN

Constraints
-10⁹ ≤ pin ≤ 10⁹

Examples

| # | Input	 |   Output     |
|---|-----------|--------------|
| 1 | 1234	 |  Valid PIN   |
| 2 | 987	 |  Invalid PIN |
| 3 | -1234	 |  Invalid PIN |
| 4 | 12345	 |  Invalid PIN |
