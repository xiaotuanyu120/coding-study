def rank(key, a):
    if type(key) is not int or (type(a) is not list and type(a) is not tuple):
        return -1
    lo = 0
    hi = len(a) - 1
    while lo <= hi:
        mid = int(lo + (hi - lo)/2)
        if key < a[mid]:
            hi = mid -1
        elif key > a[mid]:
            lo = mid +1
        else:
            return mid
    return -1

if __name__ == '__main__':
    whitelist = [1, 2, 3, 4, 5, 6, 7]
    input = [4, 5, 7, 8, 10, 9]
    for i in input:
        if rank(i, whitelist) < 0:
            print("output: ", i)