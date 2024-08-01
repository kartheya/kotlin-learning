package com.rsk

//Safe Call (?.) ---> Example : m?.method --> its checks whether m is null if m is null it does not allow the method call.
//Elvis Operator (?:) --> Example: newMeeting = m?: Meeting() If m is not null assign it to newMeeting or else assign it to Meeting.
//Safe Case -----> Example: val saveable = o as? ISaveable If o is of type ISaveable then return that instance or return null but do not throw exception
//Not-Null assertions(!!) --> Example: m!!.close() --> This indicates/asserts that m is never gonna be null. If it is null then NullPointerException is thrown

