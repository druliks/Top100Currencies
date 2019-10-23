package ru.druliks.top100currencies.di

import dagger.Component
import ru.druliks.top100currencies.activities.ChartActivity
import ru.druliks.top100currencies.activities.MainActivity
import ru.druliks.top100currencies.chart.LatestChart
import ru.druliks.top100currencies.fragments.CurrenciesListFragment
import ru.druliks.top100currencies.mvp.presenter.CurrenciesPresenter
import ru.druliks.top100currencies.mvp.presenter.LatestChartPresenter
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class,RestModule::class,MvpModule::class,ChartModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(activity: ChartActivity)

    fun inject(fragment: CurrenciesListFragment)

    fun inject(presenter: CurrenciesPresenter)
    fun inject(presenter: LatestChartPresenter)

    fun inject(chart: LatestChart)

}