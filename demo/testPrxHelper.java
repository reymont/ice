// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.0
//
// <auto-generated>
//
// Generated from file `demo.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package demo;

public final class testPrxHelper extends Ice.ObjectPrxHelperBase implements testPrx
{
    private static final String __execute_name = "execute";

    public String execute(String mth, String cmd)
    {
        return execute(mth, cmd, null, false);
    }

    public String execute(String mth, String cmd, java.util.Map<String, String> __ctx)
    {
        return execute(mth, cmd, __ctx, true);
    }

    private String execute(String mth, String cmd, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__execute_name);
        return end_execute(begin_execute(mth, cmd, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd)
    {
        return begin_execute(mth, cmd, null, false, false, null);
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd, java.util.Map<String, String> __ctx)
    {
        return begin_execute(mth, cmd, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd, Ice.Callback __cb)
    {
        return begin_execute(mth, cmd, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_execute(mth, cmd, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd, Callback_test_execute __cb)
    {
        return begin_execute(mth, cmd, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_execute(String mth, String cmd, java.util.Map<String, String> __ctx, Callback_test_execute __cb)
    {
        return begin_execute(mth, cmd, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_execute(String mth, 
                                         String cmd, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_execute(mth, cmd, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_execute(String mth, 
                                         String cmd, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_execute(mth, cmd, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_execute(String mth, 
                                         String cmd, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_execute(mth, cmd, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_execute(String mth, 
                                         String cmd, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_execute(mth, cmd, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_execute(String mth, 
                                          String cmd, 
                                          java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_execute(mth, cmd, __ctx, __explicitCtx, __synchronous, 
                             new IceInternal.Functional_TwowayCallbackArg1<String>(__responseCb, __exceptionCb, __sentCb)
                                 {
                                     public final void __completed(Ice.AsyncResult __result)
                                     {
                                         testPrxHelper.__execute_completed(this, __result);
                                     }
                                 });
    }

    private Ice.AsyncResult begin_execute(String mth, 
                                          String cmd, 
                                          java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__execute_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__execute_name, __cb);
        try
        {
            __result.prepare(__execute_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(mth);
            __os.writeString(cmd);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public String end_execute(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __execute_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            String __ret;
            __ret = __is.readString();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __execute_completed(Ice.TwowayCallbackArg1<String> __cb, Ice.AsyncResult __result)
    {
        demo.testPrx __proxy = (demo.testPrx)__result.getProxy();
        String __ret = null;
        try
        {
            __ret = __proxy.end_execute(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    public static testPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), testPrx.class, testPrxHelper.class);
    }

    public static testPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), testPrx.class, testPrxHelper.class);
    }

    public static testPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), testPrx.class, testPrxHelper.class);
    }

    public static testPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), testPrx.class, testPrxHelper.class);
    }

    public static testPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, testPrx.class, testPrxHelper.class);
    }

    public static testPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, testPrx.class, testPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::demo::test"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, testPrx v)
    {
        __os.writeProxy(v);
    }

    public static testPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            testPrxHelper result = new testPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
