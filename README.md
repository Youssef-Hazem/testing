# CI Bug Hunt — Starter

A tiny Java project with **intentional bugs** in code and tests so your first CI run is **RED**.
Your job: investigate failures, decide whether to **fix the code or fix the test**, and then add more tests until CI is **GREEN**.

## How to Use
1. `mvn -v` then `mvn clean test` locally (expect failures).
2. Create a GitHub repo and push (see Lab sheet). CI will run via Actions (see workflow).
3. Fix step-by-step:
   - Read failing stack traces.
   - Identify whether the failure is a **bug in code** or a **bug in the test/assumptions**.
   - Commit small fixes and push.
4. Add at least **3 new tests** (edge cases!) to increase confidence.
5. When CI passes, add the **build badge** to `README.md`.

> ⚠️ Some tests are deliberately **incorrect** (or based on ambiguous spec). You may fix them if you can justify *why* they are wrong.

## Classes
- `Calculator` — basic arithmetic (has off-by-one & zero-handling bugs)
- `Converter` — Celsius/Fahrenheit (has rounding/offset bug)
- `Statistics` — mean/median/variance (has integer division and even-median bug)
- `StringUtils` — palindrome, vowel count, reverseWords (case/whitespace bugs)

## Workflow
See `.github/workflows/ci.yml`. It runs `mvn -B verify` and uploads reports (Surefire + JaCoCo).

Good luck & have fun! 🔍🟡➡️🟢
