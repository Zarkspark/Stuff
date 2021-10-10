import struct
bit = (struct.calcsize("P")*8)
f = str(bit)
print("You have a " + f + " bit python application.")