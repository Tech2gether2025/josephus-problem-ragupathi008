# Josephus Problem (Java)

## Problem Statement
There are `n` people standing in a circle. Counting starts at the first person and continues around the circle.
Every `k`-th person is eliminated until only one remains.

Your task is to return the **1-based position** of the survivor.

### Input
Two integers `n` and `k`.

### Output
Print one integer — the survivor’s position.

### Example
Input:

- `n`: total number of people
- `k`: step count (every k-th person is removed)

---

## 📤 Output Format
Print **one integer** — the position of the survivor (1-based).

---

## 💡 Constraints
1 ≤ n ≤ 100000
1 ≤ k ≤ 100000
---

## 🧩 Example 1
Two space-separated integers:
**Input:**
7 3

**Output:**
4

**Explanation:**
Elimination order:
People: [1, 2, 3, 4, 5, 6, 7]
→ remove 3
→ remove 6
→ remove 2
→ remove 7
→ remove 5
→ remove 1
→ survivor = 4
**Explanation:**
Elimination order → 2, 4, 1, 5 → Survivor = 3

---

## 🚀 Task
Implement the following function inside **`Josephus.java`**:
```java
public static int josephus(int n, int k)
