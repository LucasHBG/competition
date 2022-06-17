def rotateWord(r_word, _min, _max):
    while(r_word < _min or r_word > _max):
        r_word = (r_word - _max) + _min

    return r_word



def caesarCipher(s, k):
    # Write your code here
    encp_wrd = []
    if(k > 0):
        for i in range(len(s)):
            ord_word = ord(s[i])
            if(ord_word >= 97 and ord_word <= 122):
                encrypted_word = rotateWord(ord_word + k, 96, 122)
                encp_wrd.append(chr(encrypted_word))
        
            elif(ord_word >= 65 and ord_word <= 90):
                encrypted_word = rotateWord(ord_word + k, 64, 90)
                encp_wrd.append(chr(encrypted_word))
        
            else:
                encp_wrd.append(s[i])

    else:
        return s
    

    return ''.join(encp_wrd)

caesarCipher("D3q4", 0)
# caesarCipher("abcdefghijklmnopqrstuvwxyz", 2)