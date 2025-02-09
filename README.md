# Kotlin `removeIf` Gotcha

This repository demonstrates a potential pitfall when using the `removeIf` function in Kotlin with mutable lists.  The `removeIf` function modifies the list directly, leading to unexpected results if not handled carefully.  The example illustrates this behavior and provides a solution.

**Bug:** The `removeIf` function modifies the original list in place. This behavior might not be immediately obvious and lead to bugs in larger programs.

**Solution:**  The provided solution demonstrates alternative ways to handle list filtering which avoid in place modification.