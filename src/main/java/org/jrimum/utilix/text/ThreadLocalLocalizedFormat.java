package org.jrimum.utilix.text;

import java.util.Locale;

import org.jrimum.utilix.Objects;

abstract class ThreadLocalLocalizedFormat<T,S> extends ThreadLocalFormat<T>{
	
	protected final Locale locale;
	protected final S formatSymbols;
	
	protected ThreadLocalLocalizedFormat(String format, Locale locale){
		
		super(format);
		
		Objects.checkNotNull(locale, "INVALID NULL LOCALE!");

		this.locale = locale;
		this.formatSymbols = null;
	}
	
	protected ThreadLocalLocalizedFormat(String format, S formatSymbols){
		
		super(format);
		
		Objects.checkNotNull(formatSymbols, "INVALID NULL FORMAT SYMBOLS!");

		this.formatSymbols = formatSymbols;
		this.locale = null;
	}

	protected ThreadLocalLocalizedFormat(String format, Locale locale, S formatSymbols){
		
		super(format);
		
		Objects.checkNotNull(locale, "INVALID NULL LOCALE!");
		Objects.checkNotNull(formatSymbols, "INVALID NULL FORMAT SYMBOLS!");

		this.formatSymbols = formatSymbols;
		this.locale = locale;
	}
}
