# Uncommon Scala Bug: Implicit Type Coercion in Setter Methods

This repository demonstrates a subtle bug that can occur in Scala when using custom setter methods and implicit type conversions. The bug is related to the implicit conversion of input values before validating those values, which can lead to unexpected behavior. The code might be vulnerable to errors if not careful about the implicit conversions that might be happening behind the scenes. 

## Bug Description

The `MyClass` class contains a setter method `value_=`.  This setter attempts to prevent negative values, which is good practice. However, there are potential issues with the implicit type conversion of the input.  If there are implicit type conversions defined that convert a certain type (which could result to a negative value after conversion) to `Int` in the codebase, the validation within the setter might be bypassed.