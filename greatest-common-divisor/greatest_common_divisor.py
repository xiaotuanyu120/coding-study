def greatest_common_divisor(p, q):
    if q is 0:
        return p
    else:
        r = p % q
        return greatest_common_divisor(q, r)

if __name__ == "__main__":
    result = greatest_common_divisor(8, 4)
    print(result)