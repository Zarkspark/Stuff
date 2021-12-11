a = [2,3,45,23]
so = False
n = len(a)
while so == False:

    so = True
    
    for i in range(1,n):
        if(a[i-1] > a[i]):
            so = False
            temp = a[i]
            a[i] = a[i-1]
            a[i-1] = temp

print(a)