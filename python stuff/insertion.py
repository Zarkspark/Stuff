nums = [2,1,6,3,5,4]
sorted = False
while sorted == False:
    sorted = True
    for i in range(1,len(nums)):
        if(nums[i-1] > nums[i]):
            sorted = False
            temp = nums[i]
            nums[i] = nums[i-1]
            nums[i-1] = temp
print(nums)